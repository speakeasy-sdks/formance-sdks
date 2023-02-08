import dataclasses
from ..shared import wallet as shared_wallet
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class CreateWalletResponse:
    data: shared_wallet.Wallet = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    