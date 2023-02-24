from __future__ import annotations
import dataclasses
from dataclasses_json import Undefined, dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class ConfigUser:
    endpoint: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('endpoint') }})
    event_types: list[str] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('eventTypes') }})
    secret: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('secret'), 'exclude': lambda f: f is None }})
    