import dataclasses
from ..shared import wallet as shared_wallet
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class ListWalletsResponseCursor:
    data: list[shared_wallet.Wallet] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    page_size: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('pageSize') }})
    has_more: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('hasMore') }})
    next: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next') }})
    previous: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('previous') }})
    

@dataclass_json
@dataclasses.dataclass
class ListWalletsResponse:
    cursor: ListWalletsResponseCursor = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('cursor') }})
    