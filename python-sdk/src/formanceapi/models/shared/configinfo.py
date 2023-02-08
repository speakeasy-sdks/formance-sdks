import dataclasses
from ..shared import config as shared_config
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class ConfigInfo:
    config: shared_config.Config = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('config') }})
    server: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('server') }})
    version: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('version') }})
    