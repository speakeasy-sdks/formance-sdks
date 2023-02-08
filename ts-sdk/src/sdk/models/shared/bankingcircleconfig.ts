import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class BankingCircleConfig extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=authorizationEndpoint" })
  authorizationEndpoint: string;

  @SpeakeasyMetadata({ data: "json, name=endpoint" })
  endpoint: string;

  @SpeakeasyMetadata({ data: "json, name=password" })
  password: string;

  @SpeakeasyMetadata({ data: "json, name=username" })
  username: string;
}