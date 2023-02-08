import dataclasses
from ..shared import account as shared_account
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class AccountsCursorResponseCursor:
    data: list[shared_account.Account] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    has_more: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('hasMore') }})
    page_size: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('pageSize') }})
    next: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next') }})
    previous: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('previous') }})
    

@dataclass_json
@dataclasses.dataclass
class AccountsCursorResponse:
    cursor: AccountsCursorResponseCursor = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('cursor') }})
    