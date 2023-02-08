import dataclasses
from ..shared import workflowoccurrence as shared_workflowoccurrence
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class RunWorkflowResponse:
    data: shared_workflowoccurrence.WorkflowOccurrence = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    