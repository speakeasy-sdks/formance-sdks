import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class ConnectorsConfigsResponseDataConnectorKey:
    data_type: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('dataType') }})
    required: bool = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('required') }})
    

@dataclass_json
@dataclasses.dataclass
class ConnectorsConfigsResponseDataConnector:
    key: ConnectorsConfigsResponseDataConnectorKey = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('key') }})
    

@dataclass_json
@dataclasses.dataclass
class ConnectorsConfigsResponseData:
    connector: ConnectorsConfigsResponseDataConnector = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('connector') }})
    

@dataclass_json
@dataclasses.dataclass
class ConnectorsConfigsResponse:
    data: ConnectorsConfigsResponseData = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    