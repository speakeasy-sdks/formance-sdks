import dataclasses
from ..shared import paymentmetadatachangelog as shared_paymentmetadatachangelog
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class PaymentMetadata:
    key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    value: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('value') }})
    changelog: Optional[shared_paymentmetadatachangelog.PaymentMetadataChangelog] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('changelog') }})
    