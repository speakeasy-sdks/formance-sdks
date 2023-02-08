import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class Stats:
    accounts: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('accounts') }})
    transactions: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('transactions') }})
    