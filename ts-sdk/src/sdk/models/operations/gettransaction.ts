import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";


export class GetTransactionPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=ledger" })
  ledger: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=txid" })
  txid: number;
}

export class GetTransactionRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: GetTransactionPathParams;
}

export class GetTransactionResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  errorResponse?: shared.ErrorResponse;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  transactionResponse?: shared.TransactionResponse;
}