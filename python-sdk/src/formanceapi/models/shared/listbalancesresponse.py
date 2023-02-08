import dataclasses
from ..shared import balance as shared_balance
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class ListBalancesResponseCursor:
    data: list[shared_balance.Balance] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    page_size: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('pageSize') }})
    has_more: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('hasMore') }})
    next: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next') }})
    previous: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('previous') }})
    

@dataclass_json
@dataclasses.dataclass
class ListBalancesResponse:
    cursor: ListBalancesResponseCursor = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('cursor') }})
    