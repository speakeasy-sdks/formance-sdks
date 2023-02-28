from __future__ import annotations
import dataclasses
from ..shared import wallet as shared_wallet
from dataclasses_json import Undefined, dataclass_json
from formanceapi import utils


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class CreateWalletResponse:
    data: shared_wallet.Wallet = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    