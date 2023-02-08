import dataclasses
from ..shared import balancewithassets as shared_balancewithassets
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class GetBalanceResponse:
    data: shared_balancewithassets.BalanceWithAssets = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    