import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class AssetHolder:
    assets: dict[str, float] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('assets') }})
    