import dataclasses
from dataclasses_json import dataclass_json
from enum import Enum
from formanceapi import utils

class WalletsErrorResponseErrorCodeEnum(str, Enum):
    VALIDATION = "VALIDATION"


@dataclass_json
@dataclasses.dataclass
class WalletsErrorResponse:
    error_code: WalletsErrorResponseErrorCodeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('errorCode') }})
    error_message: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('errorMessage') }})
    