import dataclasses
from ..shared import user as shared_user
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class ReadUserResponse:
    data: Optional[shared_user.User] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    