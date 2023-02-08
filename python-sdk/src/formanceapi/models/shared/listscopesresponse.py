import dataclasses
from ..shared import scope as shared_scope
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class ListScopesResponse:
    data: Optional[list[shared_scope.Scope]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    