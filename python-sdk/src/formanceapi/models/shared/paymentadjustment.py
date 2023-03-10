import dataclasses
import dateutil.parser
from ..shared import paymentstatus_enum as shared_paymentstatus_enum
from dataclasses_json import dataclass_json
from datetime import datetime
from formanceapi import utils
from marshmallow import fields
from typing import Any


@dataclass_json
@dataclasses.dataclass
class PaymentAdjustment:
    absolute: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('absolute') }})
    amount: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('amount') }})
    date_: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('date'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    raw: dict[str, Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('raw') }})
    status: shared_paymentstatus_enum.PaymentStatusEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    