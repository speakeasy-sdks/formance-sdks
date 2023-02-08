import dataclasses
import dateutil.parser
from dataclasses_json import dataclass_json
from datetime import datetime
from formanceapi import utils
from marshmallow import fields


@dataclass_json
@dataclasses.dataclass
class PaymentMetadataChangelog:
    timestamp: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('timestamp'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    value: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('value') }})
    