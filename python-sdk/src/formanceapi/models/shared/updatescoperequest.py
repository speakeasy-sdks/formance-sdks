import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Any, Optional


@dataclass_json
@dataclasses.dataclass
class UpdateScopeRequest:
    label: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('label') }})
    metadata: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('metadata') }})
    