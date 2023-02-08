import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Any, Optional


@dataclass_json
@dataclasses.dataclass
class Contract:
    expr: dict[str, Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('expr') }})
    account: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('account') }})
    