from __future__ import annotations
import dataclasses
from dataclasses_json import Undefined, dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class ConfirmHoldRequest:
    amount: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('amount'), 'exclude': lambda f: f is None }})
    final: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('final'), 'exclude': lambda f: f is None }})
    