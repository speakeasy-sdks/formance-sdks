import dataclasses
import dateutil.parser
from ..shared import posting as shared_posting
from dataclasses_json import dataclass_json
from datetime import datetime
from formanceapi import utils
from marshmallow import fields
from typing import Any, Optional


@dataclass_json
@dataclasses.dataclass
class TransactionData:
    postings: list[shared_posting.Posting] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('postings') }})
    metadata: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('metadata') }})
    reference: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('reference') }})
    timestamp: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('timestamp'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    