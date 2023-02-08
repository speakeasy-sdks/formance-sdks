import dataclasses
from ..shared import accountwithvolumesandbalances as shared_accountwithvolumesandbalances
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class AccountResponse:
    data: shared_accountwithvolumesandbalances.AccountWithVolumesAndBalances = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    