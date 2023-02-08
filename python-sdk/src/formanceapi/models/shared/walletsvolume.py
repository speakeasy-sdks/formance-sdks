import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class WalletsVolume:
    balance: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('balance') }})
    input: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('input') }})
    output: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('output') }})
    