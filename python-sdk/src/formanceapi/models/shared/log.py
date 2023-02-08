import dataclasses
import dateutil.parser
from dataclasses_json import dataclass_json
from datetime import datetime
from enum import Enum
from formanceapi import utils
from marshmallow import fields
from typing import Any

class LogTypeEnum(str, Enum):
    NEW_TRANSACTION = "NEW_TRANSACTION"
    SET_METADATA = "SET_METADATA"


@dataclass_json
@dataclasses.dataclass
class Log:
    data: dict[str, Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    date_: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('date'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    hash: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('hash') }})
    id: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: LogTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    