import dataclasses
from ..shared import paymentsaccount as shared_paymentsaccount
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class AccountsCursorCursor:
    data: list[shared_paymentsaccount.PaymentsAccount] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    has_more: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('hasMore') }})
    page_size: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('pageSize') }})
    next: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next') }})
    previous: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('previous') }})
    

@dataclass_json
@dataclasses.dataclass
class AccountsCursor:
    cursor: AccountsCursorCursor = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('cursor') }})
    