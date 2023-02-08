import dataclasses
import dateutil.parser
from ..shared import assetholder as shared_assetholder
from dataclasses_json import dataclass_json
from datetime import datetime
from formanceapi import utils
from marshmallow import fields
from typing import Any


@dataclass_json
@dataclasses.dataclass
class WalletWithBalancesBalances:
    main: shared_assetholder.AssetHolder = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('main') }})
    

@dataclass_json
@dataclasses.dataclass
class WalletWithBalances:
    balances: WalletWithBalancesBalances = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('balances') }})
    created_at: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('createdAt'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    ledger: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('ledger') }})
    metadata: dict[str, Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('metadata') }})
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    