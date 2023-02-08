import dataclasses
from ..shared import monetary as shared_monetary
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Any, Optional


@dataclass_json
@dataclasses.dataclass
class DebitWalletRequest:
    amount: shared_monetary.Monetary = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('amount') }})
    balances: Optional[list[str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('balances') }})
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    destination: Optional[Any] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('destination') }})
    metadata: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('metadata') }})
    pending: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('pending') }})
    