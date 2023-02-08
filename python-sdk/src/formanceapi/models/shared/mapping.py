import dataclasses
from ..shared import contract as shared_contract
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class Mapping:
    contracts: list[shared_contract.Contract] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('contracts') }})
    