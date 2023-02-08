import dataclasses
import dateutil.parser
from dataclasses_json import dataclass_json
from datetime import datetime
from formanceapi import utils
from marshmallow import fields
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class StageStatus:
    occurrence_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('occurrenceID') }})
    stage: float = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('stage') }})
    started_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('startedAt'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    error: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('error') }})
    terminated_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('terminatedAt'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    