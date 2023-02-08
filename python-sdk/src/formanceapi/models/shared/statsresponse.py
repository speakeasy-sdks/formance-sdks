import dataclasses
from ..shared import stats as shared_stats
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class StatsResponse:
    data: shared_stats.Stats = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    