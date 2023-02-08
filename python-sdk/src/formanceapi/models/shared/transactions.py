import dataclasses
from ..shared import transactiondata as shared_transactiondata
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class Transactions:
    transactions: list[shared_transactiondata.TransactionData] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('transactions') }})
    