import dataclasses
from ..shared import transaction as shared_transaction
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class TransactionsResponse:
    data: list[shared_transaction.Transaction] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    