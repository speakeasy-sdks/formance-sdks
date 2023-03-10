import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Any, Optional


@dataclass_json
@dataclasses.dataclass
class ExpandedDebitHold:
    description: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    metadata: dict[str, Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('metadata') }})
    original_amount: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('originalAmount') }})
    remaining: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('remaining') }})
    wallet_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('walletID') }})
    destination: Optional[Any] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('destination') }})
    