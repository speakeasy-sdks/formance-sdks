import dataclasses
from ..shared import mapping as shared_mapping
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class MappingResponse:
    data: Optional[shared_mapping.Mapping] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    