import dataclasses
from ..shared import expandeddebithold as shared_expandeddebithold
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class GetHoldResponse:
    data: shared_expandeddebithold.ExpandedDebitHold = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    