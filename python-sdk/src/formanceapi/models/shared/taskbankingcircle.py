import dataclasses
import dateutil.parser
from ..shared import paymentstatus_enum as shared_paymentstatus_enum
from dataclasses_json import dataclass_json
from datetime import datetime
from formanceapi import utils
from marshmallow import fields
from typing import Any, Optional


@dataclass_json
@dataclasses.dataclass
class TaskBankingCircleDescriptor:
    key: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    

@dataclass_json
@dataclasses.dataclass
class TaskBankingCircle:
    connector_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('connectorId') }})
    created_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('createdAt'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    descriptor: TaskBankingCircleDescriptor = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('descriptor') }})
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    state: dict[str, Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('state') }})
    status: shared_paymentstatus_enum.PaymentStatusEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    updated_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('updatedAt'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    error: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('error') }})
    