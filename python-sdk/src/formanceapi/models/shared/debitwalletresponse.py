import dataclasses
from ..shared import hold as shared_hold
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class DebitWalletResponse:
    data: shared_hold.Hold = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    