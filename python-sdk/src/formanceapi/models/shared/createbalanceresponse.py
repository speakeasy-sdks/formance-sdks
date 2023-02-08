import dataclasses
from ..shared import balance as shared_balance
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class CreateBalanceResponse:
    data: shared_balance.Balance = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    