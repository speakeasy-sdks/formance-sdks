from __future__ import annotations
import dataclasses
from dataclasses_json import Undefined, dataclass_json
from formanceapi import utils
from typing import Any, Optional


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class Contract:
    expr: dict[str, Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('expr') }})
    account: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('account'), 'exclude': lambda f: f is None }})
    