import dataclasses
import dateutil.parser
from ..shared import connector_enum as shared_connector_enum
from dataclasses_json import dataclass_json
from datetime import datetime
from enum import Enum
from formanceapi import utils
from marshmallow import fields

class PaymentsAccountTypeEnum(str, Enum):
    TARGET = "TARGET"
    SOURCE = "SOURCE"


@dataclass_json
@dataclasses.dataclass
class PaymentsAccount:
    created_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('createdAt'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    provider: shared_connector_enum.ConnectorEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('provider') }})
    reference: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('reference') }})
    type: PaymentsAccountTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    