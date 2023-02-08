import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class Monetary:
    amount: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('amount') }})
    asset: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('asset') }})
    