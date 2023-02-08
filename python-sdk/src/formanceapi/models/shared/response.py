import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Any, Optional


@dataclass_json
@dataclasses.dataclass
class ResponseCursorTotal:
    relation: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('relation') }})
    value: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('value') }})
    

@dataclass_json
@dataclasses.dataclass
class ResponseCursor:
    data: Optional[list[dict[str, Any]]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    has_more: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('hasMore') }})
    next: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('next') }})
    page_size: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('pageSize') }})
    previous: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('previous') }})
    total: Optional[ResponseCursorTotal] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('total') }})
    

@dataclass_json
@dataclasses.dataclass
class Response:
    cursor: Optional[ResponseCursor] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('cursor') }})
    data: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    