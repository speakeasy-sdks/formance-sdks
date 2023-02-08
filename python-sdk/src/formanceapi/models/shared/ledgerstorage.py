import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class LedgerStorage:
    driver: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('driver') }})
    ledgers: list[str] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('ledgers') }})
    