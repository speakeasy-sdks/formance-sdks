import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class BalancesCursorResponseCursor:
    data: list[dict[str, dict[str, int]]] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    has_more: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('hasMore') }})
    page_size: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('pageSize') }})
    next: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next') }})
    previous: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('previous') }})
    

@dataclass_json
@dataclasses.dataclass
class BalancesCursorResponse:
    cursor: BalancesCursorResponseCursor = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('cursor') }})
    