import dataclasses
from dataclasses_json import dataclass_json
from enum import Enum
from formanceapi import utils

class ErrorErrorCodeEnum(str, Enum):
    VALIDATION = "VALIDATION"


@dataclass_json
@dataclasses.dataclass
class Error:
    error_code: ErrorErrorCodeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('errorCode') }})
    error_message: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('errorMessage') }})
    