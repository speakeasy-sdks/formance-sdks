import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class Volume:
    input: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('input') }})
    output: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('output') }})
    balance: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('balance') }})
    