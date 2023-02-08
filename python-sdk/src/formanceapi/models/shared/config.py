import dataclasses
from ..shared import ledgerstorage as shared_ledgerstorage
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class Config:
    storage: shared_ledgerstorage.LedgerStorage = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('storage') }})
    