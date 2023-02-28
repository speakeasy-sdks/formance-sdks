from __future__ import annotations
import dataclasses
from ..shared import transaction as shared_transaction
from dataclasses_json import Undefined, dataclass_json
from formanceapi import utils


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class TransactionResponse:
    data: shared_transaction.Transaction = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    