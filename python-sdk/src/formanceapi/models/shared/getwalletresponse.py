import dataclasses
from ..shared import walletwithbalances as shared_walletwithbalances
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class GetWalletResponse:
    data: shared_walletwithbalances.WalletWithBalances = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    