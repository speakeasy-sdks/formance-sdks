import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class User extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=email" })
  email?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=subject" })
  subject?: string;
}