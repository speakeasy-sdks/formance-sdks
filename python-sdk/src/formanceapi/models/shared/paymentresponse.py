import dataclasses
from ..shared import payment as shared_payment
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class PaymentResponse:
    data: shared_payment.Payment = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    