import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class User:
    email: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('email') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    subject: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('subject') }})
    